package com.qindaorong.spi.impl;

import com.qindaorong.spi.api.IMessageChannel;

public class SpringSecondMessageChannel implements IMessageChannel {
    @Override
    public String sendMessage(String context) {
        return "SpringSecondMessageChannel-sendMessage:"+ context;
    }
}
