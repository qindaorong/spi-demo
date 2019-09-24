package com.qindaorong.spi;

import com.qindaorong.spi.api.IMessageChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        List<IMessageChannel> list = SpringFactoriesLoader.loadFactories(IMessageChannel.class, SpringFactoriesLoader.class.getClassLoader());
        for(IMessageChannel messageChannel:list){
            System.out.println(messageChannel.sendMessage("hallo world!"));
        }
    }
}
