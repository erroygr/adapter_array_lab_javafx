package model;

class OrdArray {
    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    //-----------------------------------------------------------
    public OrdArray(int max)          // constructor
    {
        a = new long[max];             // create array
        nElems = 0;
    }
    //-----------------------------------------------------------
    public int size()
    {
        return nElems;
    }
    //-----------------------------------------------------------
    public int find(long searchKey)   //найти
    {
        int lowerBound = 0;
        int upperBound = nElems-1;
        int curIn;

        while(true)
        {
            curIn = (lowerBound + upperBound ) / 2;
            if(a[curIn]==searchKey)
                return curIn;              // found it
            else if(lowerBound > upperBound)
                return nElems;             // can't find it
            else                          // divide range
            {
                if(a[curIn] < searchKey)
                    lowerBound = curIn + 1; // it's in upper half
                else
                    upperBound = curIn - 1; // it's in lower half
            }  // end else divide range
        }  // end while
    }  // end find()
    //-----------------------------------------------------------
    public void insert(long value)    // добавить элемент
    {
        int j;
        for(j=0; j<nElems; j++)        // find where it goes
            if(a[j] > value)            // (linear search)
                break;
        for(int k=nElems; k>j; k--)    // move bigger ones up
            a[k] = a[k-1];
        a[j] = value;                  // insert it
        nElems++;                      // increment size
    }  // end insert()
    //-----------------------------------------------------------
    public boolean delete(long value)  // удалить элемент
    {
        int j = find(value);
        if(j==nElems)                  // can't find it
            return false;
        else                           // found it
        {
            for(int k=j; k<nElems; k++) // move bigger ones down
                a[k] = a[k+1];
            nElems--;                   // decrement size
            return true;
        }
    }  // end delete()
    //-----------------------------------------------------------
    public String display()             // displays array contents
    {
        String str="";
        for(int j=0; j<nElems; j++)       // for each element,
            str+=a[j] + " ";  // add to String
        return str;
    }
    //-----------------------------------------------------------
}  // end class OrdArray