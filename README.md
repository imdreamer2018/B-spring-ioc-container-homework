@Component注解需要在class上声明一个Bean，它确实可以直接告诉Spring。但是在某些情况下，我想要开发一个功能的class A，但我发现某个class B已经实现了这个相同的功能，并且class B没有用spring，B有可能是打好的jar包，也有可能是我没有这个class B的源码，我也不能在上面直接加@component，这种情况下，我就可以用@Configuration和@Bean引入class B来实现这个功能。

