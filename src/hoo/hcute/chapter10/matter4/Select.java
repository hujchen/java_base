package hoo.hcute.chapter10.matter4;

public class Select {

    private String id;
    private String clazz;

    class OnChange{
        private String id;
        private String clazz;

        public OnChange(String id,String clazz){
            this.id = id;
            this.clazz =clazz;
        }

        public void change(){
            Select.this.id = id;
            Select.this.clazz = clazz;
            Select.this.desc();
        }
    }

    private void desc(){
        System.out.println("<select id='" + id + "' class='" + clazz+"'></select>");
    }

    public void change(String id,String clazz){
        new OnChange(id,clazz).change();
    }

    public static void main(String[] args) {
        Select select = new Select();
        select.change("roles","select2");
    }
}
