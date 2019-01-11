public class stackNode
{
    public int info;
    public stackNode next;
    public stackNode(int i)
    {
        this(i,null);
    }
    public stackNode(int i, stackNode n)
    {
        info = i; next = n;
    }
}
