module two {
//    requires  java.logging;
    requires transitive java.logging;
    exports com.example.person;
}