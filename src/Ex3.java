import java.util.*;
class Ex3{
    PriorityQueue<Element> queue = new PriorityQueue<>(
        new Comparator<Element>(){
        @Override
        public int compare(Element element1, Element element2) {
            return element2.priority - element1.priority;
        }
    });
    
    int priority = 1;
    
    public void push(int val){
        Element element = new Element(priority++,val);
        queue.add(element);
    }
    
    public Integer pop(){
        if(queue.isEmpty()){
            return null;
        }
        return queue.poll().value;
    }
    public Integer peek(){
        if(queue.isEmpty()){
            return null;
        }
        return queue.peek().value;
    }
}
    
class Element{
    int priority;
    int value;
    
    public Element(int priority , int value) {
        this.priority = priority;
        this.value = value;
    }
}