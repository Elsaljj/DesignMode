import com.observer.pattern.ConcreteObserver;
import com.observer.pattern.ConcreteSubject;
import com.observer.pattern.Subject;

/**
 * Created by jingjlia on 2016/2/18.
 */
public class ObserverPatternTest {
    public static void main(String[] args){
        Subject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver("Observer A", (ConcreteSubject) subject));
        subject.attach(new ConcreteObserver("Observer B", (ConcreteSubject) subject));
        subject.attach(new ConcreteObserver("Observer C", (ConcreteSubject) subject));

        ((ConcreteSubject) subject).setSubjectState("Ready");
        subject.notifyall();
    }
}
