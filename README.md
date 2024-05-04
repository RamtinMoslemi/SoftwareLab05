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


۲. برای این بخش تلاش می‌کنیم کدی بنویسیم که ریشه دوم اعداد را پیدا کند. برای انجام این کار از روش‌های مختلف استفاده می‌کنیم تا میزان مصرف منابع آن‌ها را با هم مقایسه کنیم.
