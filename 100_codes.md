## 1. Check the number is positive, negative and zero

### Code

```c++
#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<< "Enter a Number" << endl;
    cin>>n;
    if(n >= 0)
    {
        if(n == 0)
            cout<< "The Number is Zero" << endl;
        else
            cout<< "The Number is Positive" << endl;
    }
    else
    {
        cout<<"The Number is Negative" << endl;
    }
}
```

## 2. Check the number is even or odd

### Code

```c++
#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<< "Enter a number" << endl;
    cin>>n;

    if( n % 2 == 0)
        cout<< "The Number is Even" << endl;
    else
        cout<< "The Number is Odd" << endl;

}
```

## 3. Sum of N Natural Numbers

### Code

```c++
#include<iostream>
using namespace std;
int main()
{
    int n;
    
    cout<< "Enter a number" << endl;
    cin>>n;

    int sum = 0;
    
    for(int i = 1; i <= n; i++)
    {
        sum = sum + i;
    }
    cout<< "Sum = " << sum << endl;
}
```

## 4. Sum of Numbers in a Given Interval

### Code

```c++
#include<iostream>
using namespace std;
int main()
{
    int n1, n2;
    
    cout<< "Enter a number1 and number2" << endl;
    cin>>n1>>n2;

    int sum = 0;
    
    for(int i = n1; i <= n2; i++)
    {
        sum = sum + i;
    }
    cout<< "Sum = " << sum << endl;
}
```

## 5. Greatest of 2 Numbers

### Code

```c++
#include<iostream>
using namespace std;
int main()
{
    int n1, n2;
    cout<< "Enter a number" << endl;
    cin>> n1 >> n2;

    if (n1 > n2)
        cout<< " " << n1 << " is Greater than " << n2 << endl;
    else if(n2 > n1)
        cout<< " " << n2 << " is Greater than " << n1 << endl;
    else
        cout<< "Both are equal" << endl;

}
```