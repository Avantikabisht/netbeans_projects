
package tcp2way;
import java.net.*;
import java.io.*;

/**
 *
 * @author avantika
 */
public class TCPServer {
    public static void main(String args[])throws IOException
    {
        ServerSocket ss= new ServerSocket(8000);
        Socket s=ss.accept();
        DataInputStream in = new DataInputStream(System.in);
                DataInputStream inn = new DataInputStream(s.getInputStream());
                        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
while(true)
{
    System.out.println("enter message to send");
    String str=in.readLine();
            dos.writeUTF(str);
if(str.equals("end"))
{
    ss.close();
    break;
}
String str2=(String)inn.readUTF();
System.out.println("\n message is"+str2);
if(str2.equals("end"))
{
    s.close();
    break;
}
}
    }
}


}}

        
    }
}
