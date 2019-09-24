package com.qindaorong.spi.adaption;

/*
*
* org.apache.dubbo.common.compiler.Compiler 的自适应拓展
*
* 找对应META-INF/services/org.apache.dubbo.common.compiler.Compiler文件下的key=adaptive的类的实现
*
*
adaptive=org.apache.dubbo.common.compiler.support.AdaptiveCompiler
jdk=org.apache.dubbo.common.compiler.support.JdkCompiler
javassist=org.apache.dubbo.common.compiler.support.JavassistCompiler
*
* 即org.apache.dubbo.common.compiler.support.AdaptiveCompiler
*
* @Adaptive可以在类上也可以在方法上。
*
* 在类上
* AdaptiveCompiler 必须有@Adaptive标签，表示该类为一个自适应拓展点。AdaptiveCompiler在这里类似一个适配器，也是一个动态代理。
* 如图Compiler有2个实现：分别为JdkCompiler和JavassistCompiler，在可以被拓展的类上必须有@SPI()标签，在@SPI标签中传递的name 为默认加载项。
*

@SPI("javassist")
public interface Compiler {
    Class<?> compile(String var1, ClassLoader var2);
}
* 即Compiler类的默认加载项为javassist。
*
* 在方法上
* 根据传入的值不同动态生成一个代理类来完成对选择方法的动态代理。
*
*
*
*
* */