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