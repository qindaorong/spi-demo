package com.qindaorong.spi.impl;

import com.qindaorong.spi.api.IMessageChannel;

public class Demo1MessageChannel implements IMessageChannel {
    @Override
    public String sendMessage(String context) {
        return "Demo1MessageChannel-sendMessage:"+ context;
    }
}
