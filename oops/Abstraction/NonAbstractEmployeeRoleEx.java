package oops.Abstraction;

public class NonAbstractEmployeeRoleEx extends AbstractEmployeeEx{



    //Explicit overriding
    @Override // annotation
    public void futureDesignation() {
        System.out.println(
                "future designation : Backend Developer / Data Engineer"
        );

    }


    public static void main(String[] args) {
        NonAbstractEmployeeRoleEx obj = new NonAbstractEmployeeRoleEx();
        obj.name();
        obj.designation();
        obj.futureDesignation();
    }
}
