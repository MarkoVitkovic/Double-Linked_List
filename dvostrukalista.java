public class dvostrukalista {
    /**
     * Implementacija dvostruko povezane liste
     * Rad se obavlja preko stack i queue
     * Operacije za stack su: pop,push,peek
     * pop - dohvaca element sa stoga
     * push - dodaje element na stog
     * peek - vraća slijedeći element sa stoga ali element ostaje u stogu
     * Operacije za stack su: poll, offer,element
     * poll - dohvaca element s pocetka reda
     * offer - stavlja element na kraj reda
     * element - dohvaća element sa početka reda ali element ostaje u redu
     * imamo i dodatne operacije: size, tostring, contains, isempty
     * size - broj elemenata u listi
     * tostring - elemente pretvra u string
     * contains - da li sadrzi taj element
     * isempty - da li je lista prazna
     * @author Marko Vitkovic
     */
    NODE head;
    NODE tail;
    int size;

    private class NODE {
        NODE next;
        NODE previous;
        Object data;

        public NODE(Object obj) {
            this.data = obj;
        }
    }

    /**
     * vraca velicinu liste
     * @return integer
     */

    public int size() {
        return size;
    }

    /**
     * provjerava da li je lista prazna
     * @return true or false
     */
    public boolean isEmpty() {
        if (size==0)
            return true;
        return false;
    }

    /**
     * dodaje element na stog
     * @param obj
     */
    public void push(Object obj) {
        NODE newNode = new NODE(obj);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    /**
     * uklanja element sa stoga
     * @return uklonjei object
     */
    public Object pop() {
        if (head == null) return null;
        NODE n = head;
        head = head.next;
        size--;

        return n.data;
    }

    /**
     *vraca element sa vrha, ali element ostaje na stoku
     * @return object
     */
    public Object peek() {
        if (head == null) return null;

        return head.data;
    }

    /**
     * provjerava dali red sadrzi element
     * @param value
     * @ true or false
     */
    public boolean contains(Object value) {
        NODE current = head;

        while (current != null) {
            if (current.data.equals(value)) {
                return true;
            }

            current = current.next;
        }
        return false;
    }

    /**
     * pretvara elemente u listi u string
     * @return string
     */
    public String toString(){
        String str="";
        if(isEmpty()){
            return "List is empty";
        }
        NODE n=head;
        while (n!=null)
        {
            String dataString=(n.data).toString();
            str=str.concat(dataString);
            n=n.next;
        }
        return str;
    }

    /**
     * dodaje element na kraj reda
     * @param obj
     */
    void offer(Object obj){
        NODE n=new NODE(obj);
        n.next=null;
        if(head!=null) {
            NODE last = head;
            while (last.next != null)
                last = last.next;
            last.next = n;
            n.previous = last;
        }
        else
        {
            head=n;
        }
        size++;

    }

    /**
     * dohvaca element s pocetka reda ali element ostaje u redu
     * @return object
     */
    public Object element(){
        return head.data;
    }
    public Object poll(){
        NODE n=new NODE(head.data);
        head=head.next;
        head.previous=null;
        size--;
        return n.data;
    }



    public static void main(String[] args)
    {
        dvostrukalista stack = new dvostrukalista();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("element na vrhu je " +  stack.peek());
        System.out.println("string je = " + stack.toString());
        System.out.println("prvi element u redu :" + stack.poll());
        //stack.pop();
        //stack.pop();
        //stack.pop();

        //stack.offer(6);
        //stack.offer(7);
        //stack.offer(8);


        if (stack.isEmpty()) {
            System.out.print("Prazno\n");
        } else {
            System.out.print("Nije prazno\n");
        }

        if (stack.contains(1)) {
            System.out.print("Sadrzi broj\n");
        } else {
            System.out.print("Ne sadrzi\n");
        }

    }
}


