public  int[] middleWay(int[] a, int[] b) {
        int middleA = a[a.length / 2];
        int middleB = b[b.length / 2];

        int[] newArr = new int[2];
        newArr[0] = middleA;
        newArr[1] = middleB;

        return newArr;
    }