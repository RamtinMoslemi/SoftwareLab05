# SoftwareLab05


## تمرین 
۱. با بررسی و تحلیل برنامه JavaCup در می‌یابیم که خط ۲۹ بیشترین مصرف منابع را به همراه دارد:
![IMAGE 2024-05-04 16:18:46](https://github.com/RamtinMoslemi/SoftwareLab05/assets/76493699/11cabd9f-974f-4aaa-91f1-5c9b9466e3ce)
که این بخش مربوط به تابع temp می‌باشد:

‍‍‍```
public static void temp() {
  ArrayList a = new ArrayList();
    for (int i = 0; i < 10000; i++)
      {
        for (int j = 0; j < 20000; j++) {
          a.add(i + j);
        }
      }
}
```
