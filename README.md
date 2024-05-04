# SoftwareLab05


## تمرین 
۱. با بررسی و تحلیل برنامه JavaCup در می‌یابیم که خط ۲۹ بیشترین مصرف منابع را به همراه دارد:

![IMAGE 2024-05-04 16:18:46](https://github.com/RamtinMoslemi/SoftwareLab05/assets/76493699/11cabd9f-974f-4aaa-91f1-5c9b9466e3ce)

که این بخش مربوط به تابع temp می‌باشد:

![IMAGE 2024-05-04 22:54:48](https://github.com/RamtinMoslemi/SoftwareLab05/assets/76493699/61f2e85e-94cf-4cfc-a789-2a8baa5fbfe7)

با توجه به اینکه این تابع کاربردی در برنامه ندارد می‌توان آن را کنار گذاشته تا عملکرد کد بهبود پیدا کند:

![IMAGE 2024-05-04 22:55:49](https://github.com/RamtinMoslemi/SoftwareLab05/assets/76493699/0a953a5c-96ed-4e84-8ae2-88baab6e0eb3)

اما اگر بخواهیم که این تابع همچنان به کار خود به صورت قبل ادامه دهد، می‌توان آن را با pre-allocate مقداری از حافظه برای ذخیره integerهای خواسته شده در ArrayList آن را به صورت زیر تغییر داد:


```java
public static void temp() {
        ArrayList<Integer> a = new ArrayList<Integer>(200000000);
        for (int i = 0; i < 10000; i++)
        {
            for (int j = 0; j < 20000; j++) {
                a.add(i + j);
            }
        }
    }
```

که در این صورت عملکرد کد بهبود می‌یابد:

![IMAGE 2024-05-04 23:03:28](https://github.com/RamtinMoslemi/SoftwareLab05/assets/76493699/59122515-7edb-4494-9610-7ca3400e333a)


۲. برای این بخش تلاش می‌کنیم کدی بنویسیم که ریشه معادله `x^3 - x^2 + 2‍` را پیدا کند. برای انجام این کار از روش‌های مختلف استفاده می‌کنیم تا میزان مصرف منابع آن‌ها را با هم مقایسه کنیم.

در روش اول به صورت incremental مقدار ریشه را افزایش و کاهش می‌دهیم تا هنگامی که اختلاف مقدار تابع از مقداری ثابت کمتر شود. کد این روش به شرح زیر است:

 
```java
static void incremental(double a)
    {
        while (Math.abs(func(a)) >= EPSILON)
        {
            if (func(a) < 0)
                a += STEP;
            else
                a -= STEP;
        }
        //prints value of c upto 4 decimal places
        System.out.printf("The value of root is : %.4f", a);
    }
```

عملکرد این کد به صورت زیر می‌باشد(incremental با ورودی 999999):

![IMAGE 2024-05-04 23:33:52](https://github.com/RamtinMoslemi/SoftwareLab05/assets/76493699/03d002b5-2d14-45a4-8fc3-46e23b262ba6)

 حال برای بهبود این تابع الگوریتم بهتری (الگوریتم bisection) را انتخاب می‌کنیم:

```java
 static void bisection(double a, double b)
    {
        if (func(a) * func(b) >= 0)
        {
            System.out.println("You have not assumed"
                    + " right a and b");
            return;
        }

        double c = a;
        while (Math.abs(b-a) >= EPSILON)
        {
            // Find middle point
            c = (a+b)/2;

            // Check if middle point is root
            if (func(c) == 0.0)
                break;

                // Decide the side to repeat the steps
            else if (func(c)*func(a) < 0)
                b = c;
            else
                a = c;
        }
        //prints value of c upto 4 decimal places
        System.out.printf("The value of root is : %.4f",c);
    }
```

و عملکرد آن به صورت زیر خواهد شد(روش بایسکشن با ورودی 999999 و -999999):
![IMAGE 2024-05-04 23:57:39](https://github.com/RamtinMoslemi/SoftwareLab05/assets/76493699/43258803-4ab0-4f59-a878-2a87d505f7b8)
:
