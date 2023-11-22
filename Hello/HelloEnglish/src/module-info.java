module HelloEnglish {
    requires ServicesInModule;
    provides hello.HelloWorld with en.hello.EnHelloWorld;
}