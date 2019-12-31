package hoo.hcute.chapter10.matter4.exercise;

public class Select {

    private AttrSet attrSet;

    class AttrSet {
        private String id;
        private String clazz;

        private void set(String id,String clazz){
            this.id = id;
            this.clazz = clazz;
            Select.this.attrSet = this;
        }

        private void show(){
            Select.this.desc();
        }
    }

    private void desc(){
        System.out.println("<select id='" + attrSet.id+"' class='" +attrSet.clazz+"'></select>");
    }

    public AttrSet getAttrSet(){
        return new AttrSet();
    }

    public static void main(String[] args) {
        Select select = new Select();
        AttrSet attrSet = select.getAttrSet();
        attrSet.set("emps","select2");
        attrSet.id = "depts";
        attrSet.show();
    }


}
