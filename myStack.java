
public class myStack
{
    protected stackNode top;

    public myStack()
    {
        top = null;
    }
    public boolean isEmpty()
    {
        return top == null;
    }

    public void push(int x)
    {
        top = new stackNode(x, top);
    }

    public int pop()
    {
        int x = top.info;
        top = top.next;
        return x;
    }

    public void clear()
    {
        for(stackNode temp = top; temp != null; temp = temp.next)
        {
            pop();
        }
    }

}
