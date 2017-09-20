package test;

import database.isaac.CheckCmd;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;  
  
public class ServerInHandler extends ChannelInboundHandlerAdapter{  

      
    @Override  
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {  
        System.out.println("server channelRead..");  
        System.out.println(ctx.channel().remoteAddress()+"->Server :"+ msg.toString());  
        Call(msg.toString());
        ctx.write("server write"+msg);  
        ctx.flush();  
    }  
    
    private static void Call(String Command){
    	CheckCmd checkCmd = new CheckCmd();
    	checkCmd.check(Command);
    }
      
    @Override  
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {  
        cause.printStackTrace();  
        ctx.close();  
    }  
  
}  