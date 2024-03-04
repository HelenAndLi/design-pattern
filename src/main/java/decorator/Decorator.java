package decorator;

public class Decorator extends Component {

    protected Component component;

    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void operation(){
        if(component != null){
            System.out.println("有的"+component.getClass());
            component.operation();
        }
    }
}
