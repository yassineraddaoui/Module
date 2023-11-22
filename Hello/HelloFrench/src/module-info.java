module HelloFrench {
    requires ServicesInModule;
    provides hello.HelloWorld with fr.hello.FrHelloWorld;
}