import java.util.ArrayList;
import java.util.List;

public class Tree <T>{
     private List<Tree<T>> subtrees;
     private T root;

     public Tree(T root , List<Tree<T>> subtrees ){
         this.root = root;
         if (subtrees == null){
             this.subtrees = new ArrayList<>();
         }else {
             this.subtrees = new ArrayList<>(subtrees);
         }
     }

     public boolean is_empty(){
         return (this.root == null);
     }

    public  int length(){
        int sum;
        if(is_empty()){
            sum = 0;
        }
        else{
            sum = 1;
            for (Tree<T> k: this.subtrees){
                sum += k.length();
            }

        }
        return sum;
     }






}
