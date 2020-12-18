package anonmoymous;
public class Anonmoymous {

    public static void main(String[] args) {
        abdullah obj = new abdullah();
       obj.obj.main();
    }
    
}
class sameer{

        public void main()
        {
        
            System.out.println("sameer li class");
        
        }
}
class abdullah 
{

    sameer obj = new sameer()
    {
        @Override
            public void main()
            {
                System.out.println("anoymous class");
            
            }
    };
    



}