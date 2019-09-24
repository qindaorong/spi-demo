package com.qindaorong.spi;

import com.qindaorong.spi.api.IMessageChannel;

import java.util.ServiceLoader;

public class App {
   public static void main(String[] args) {
       ServiceLoader<IMessageChannel> serviceLoader =ServiceLoader.load(IMessageChannel.class);
       for(IMessageChannel messageChannel:serviceLoader){
            System.out.println(messageChannel.sendMessage("hallo world!"));
       }
   }
}
