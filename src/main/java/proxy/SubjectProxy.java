package proxy;

public class SubjectProxy extends Subject {

    private RealSubject realSubject;

    @Override
    public void request(){
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
