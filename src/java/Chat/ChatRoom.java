package Chat;
 
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonWriter;
 
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
 
@ServerEndpoint("/chatroom")
public class ChatRoom {
    
       private static Set<Session> clients = Collections.synchronizedSet(new HashSet<Session>());
 
    @OnMessage
    public void onMessage(String message, Session session) throws IOException,
            InterruptedException {
        System.out.println("User input: " + message);
        String username=(String)session.getUserProperties().get("username");
         if(username==null){
            
            session.getUserProperties().put("username", message);
            session.getBasicRemote().sendText(this.buildJsonData("System","Ban da ket noi thanh cong"+message));
            
        }
        else{
            for (Session client : clients) {
                
                 client.getBasicRemote().sendText(buildJsonData(username, message));
                     
                 }
 
            //Iterator<Session> iterator=clients.iterator();
            //while (iterator.hasNext()) iterator.next().getBasicRemote().sendText(buildJsonData(username, message));
        }
       // session.getBasicRemote().sendText("Hello world Mr. " + message);
        // Sending message to client each 1 second
     //   for (int i = 0; i <= 25; i++) {
       //     session.getBasicRemote().sendText(i + " Message from server");
        //    Thread.sleep(1000);
 
      //  }
    }
 
    @OnOpen
    public void onOpen(Session session) {
         
        System.out.println("Client connected");
        clients.add(session);
        
    }
 
    @OnClose
    public void onClose() {
        System.out.println("Connection closed");
    }
    
    private String buildJsonData(String username,String message){
        JsonObject  jsonObject=Json.createObjectBuilder().add("message", username+": "+message).build();
        StringWriter stringWriter=new StringWriter();
         
           try (JsonWriter jsonWriter=Json.createWriter(stringWriter)){jsonWriter.write(jsonObject);}
            
         
        return stringWriter.toString();
    }
}