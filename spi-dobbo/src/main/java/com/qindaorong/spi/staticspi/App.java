package com.qindaorong.spi.staticspi;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

public class App {

    public static void main(String[] args) {
        //自定义静态拓展点
        Protocol protocol= ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("myProtocol");
        //默认拓展点
        //Protocol protocol= ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("true");
        System.out.println(protocol.getDefaultPort());
    }
}
