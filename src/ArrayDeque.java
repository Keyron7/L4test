class ArrayDeque<T extends Comparable<? super T>>{
    private int size;
    private int size1;
    private Object[] array = new Object[4];

    private int getSize(){
        this.size = 0;
        for (Object X:array
        ) {if (X!=null){ size++; }}
        return size;
    }//非空数组长度
    private Object getArray(int i){
        return array[i];
    }
    void addHead(T head){
        this.size = 0;
        this.size1 = 0;
        for (Object X:array
        ) {if (X!=null){ size++; }
            if (array[array.length-1]!=null){
                Object[] array1 = new  Object[array.length*2];
                for (Object x:array
                ) {
                    array1[size1++] = x;
                }
                array = array1;
            } }
        for (int i = 0;i<size;i++){
            array[i+1]=array[i];
        }
        array[0]=head;
    }//头部添加元素
    void deleteHead(){
        this.size = 0;
        for (Object X:array
        ) {if (X!=null){ size++; }}
        for (int i = 0;i<size;i++){
            array[i]=array[i+1];
        }
    }//删除头部元素
    void addTail(T tail){
        this.size = 0;
        this.size1 = 0;
        for (Object X:array
        ) {if (X!=null){ size++; }
            if (array[array.length-1]!=null){
                Object[] array1 = new  Object[array.length*2];
                for (Object x:array
                ) {
                    array1[size1++] = x;
                }
                array = array1;
            } }
        array[size] = tail;
    }//尾部添加元素
    void deleteTail(){
        this.size = 0;
        for (Object X:array
        ) {if (X!=null){ size++; }}
        array[size-1] = null;
    }//删除尾部元素
    boolean found(T a){
        this.size = 0;
        for (Object X:array
        ) {if (X!=null){ size++; }}
        boolean j = false;
        addTail(a);
        for (int i = 0;i<size;i++){
            for (int k = 1;k<size;k++){
                if (array[i]==array[k]){
                    j = true;
                }
            }
        }
        deleteTail();
        return j;
    }//查找元素是否存在
    void change(int a, T b){
        array[a]=b;
    }//更改元素
    T largest(){
        this.size = 0;
        for (Object X:array
        ) {if (X!=null){ size++; }}
        T temp = (T) array[0];
        for (int i = 0;i<size;i++){
            if (temp.compareTo((T) array[i])<0){
                temp = (T)array[i];
            }
        }
        return temp;
    }//得到最大元素
    T minimum(){
        this.size = 0;
        for (Object X:array
        ) {if (X!=null){ size++; }}
        T temp = (T) array[0];
        for(int i = 0;i<size;i++){
            if (temp.compareTo((T)array[i])>0){
                temp=(T)array[i];
            }
        }
        return temp;
    }//得到最小元素
    T middle(){
        this.size = 0;
        for (Object X:array
        ) {if (X!=null){ size++; }}
        for (int i = 0;i<size-1;i++){
            for (int j = 0 ;j<size-1-i;j++){
                T ret = (T) array[j];
                T temp = (T) array[j+1];
                if (ret.compareTo(temp)>0){
                    array[j] = array[j+1];
                    array[j+1] = ret;
                }
            }
        }
        T a = (T) array[size/2];
        return a;

    }//得到中间大的数

    void printAll(){
        for (int i = 0;i<getSize();i++) {
            System.out.println(getArray(i));
        }
    }
    public void addOneElement(T a){
        addTail(a);
    }

}
