/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author MY PC
 */
public interface NewInterface {

    public static void main(String[] args) {

    }
}

interface sa {

    public void sa();

}

interface pagal {

}

//class B implements sa,pagal
//{
//    
//}
class A implements sa, pagal {

    @Override
    public void sa() {
        System.out.println("implements wala methode");

    }
    

}

class house {

    void main() {
    
        System.out.println("parent class smile class");
    }
}

class sameer {

    void main() {
        System.out.println("parent class smile class");
    }
}

class gar extends house implements sa {

    @Override
    public void sa() {
        System.out.println("partent ka extend han ");
    }

}
