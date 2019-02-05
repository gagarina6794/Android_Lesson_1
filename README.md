
<img src="https://cdn1.savepice.ru/uploads/2019/2/3/50aa6328bda9132ab6e0266ac6c7dcc7-full.png"/>

# Star Android & JAVA Online Projects  представляют:

## Курс по разработке приложения для Android: Tamagotchi


---
> **Требование к участникам:**
> - **Знание Java Core**

> Оптимально:
> - Курс [BaseJava](http://javaops.ru/reg/basejava)
> - Бесплатный курс ["Программирование под Андроид"](https://javarush.ru/quests/QUEST_GOOGLE_ANDROID) на Java Rush
---


### Программа курса:

- #### Первое открытое занятие:

  - Установка Android Studio и Genymotion
  - Создание нового проекта
  - Hello World!
  - Layout
  - ImageView
  - Button
  - Смена Activity
  - Animation
  - Домашнее задание: HW_1

- #### Занятие 2

  - Разбор HW_1
  - Создание меню
  - Lifecycle приложения на Android
  - AlertDialog
  - DataBase  SQLite
  - Shared Preferences
  - RecyclerView
  - Домашнее задание: HW_2

- #### Занятие 3

  - Разбор HW_2
  - Receiver
  - AlarmManager
  - Handler
  - Notification
  - ProgressBar
  - Домашнее задание: HW_3

- #### Занятие 4

  - Разбор HW_3
  - Рефакторинг
  - SoundPool
  - Spinner Adapter
  - No title bar
  - Добавление коммерческой рекламы Admob
  - landscape
  - Домашнее задание: HW_4

- #### Занятие 5 

  - Разбор HW_4
  - Публикация приложения в Google Play

---

## Инструкция по работе с курсом:

- По ходу видео сделать Apply Patch... соответствующего патча
- Закоммитить и запушить изменения (commit + push)
- Сделать ветку домашнего задания
- Выполнить задание и залить на GitHub (commit + push)
- Переключиться в основную ветку проекта master

### **[Wiki по ведению проекта в Git](https://github.com/JavaOPs/topjava/wiki/Git)**


## Занятие 1

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 1. [О проекте и установка ПО.](https://drive.google.com/open?id=1_rCSROQjSxQ8dqpNgOKuAsQacN59KGf_)

#### 1. Установить ПО (git, JDK8, Android Studio, Genymotion)

#### 2. Создать аккаунт на GitHub

- [**Android Studio**](https://developer.android.com/studio/)
- [**Genymotion**](https://www.genymotion.com)
- [GIT](https://git-scm.com/downloads)
- [Установка GIT](https://www.youtube.com/watch?v=mpK_MYb38zs) <img src="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png" width="15"/>
- [Что такое Git](https://drive.google.com/file/d/0B9Ye2auQ_NsFSUNrdVc0bDZuX2s/edit) <img src="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png" width="15"/>
  - [Видео по обучению Git](https://www.youtube.com/playlist?list=PLIU76b8Cjem5B3sufBJ_KFTpKkMEvaTQR) <img src="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png" width="15"/>
  - [Основы Git за 20 минут](https://www.youtube.com/watch?v=TMeZGvtQnT8) <img src="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png" width="15"/>
- [JDK8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Как установить JDK8](https://www.youtube.com/watch?v=D59Sd7D58F0) <img src="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png" width="15"/>

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 2. Hello World

#### 1. Сделать Fork **[ЭТОГО](https://github.com/qf05/Android_Lesson_1)** проекта

#### 2. [Скачать патчи](https://drive.google.com/open?id=1WPWIwHDHmeuf93dWTtaHloWpvX1Xkb9s)

#### 3. Применить 1_0_hallo_world.patch (apply + commit + push)

- [Компоненты экрана](https://startandroid.ru/ru/uroki/vse-uroki-spiskom/13-urok-4-elementy-ekrana-i-ih-svojstva.html)
- [Layout](http://developer.alexanderklimov.ru/android/theory/layout.php)
- [LinearLayout](http://developer.alexanderklimov.ru/android/layout/linearlayout.php)
- [RelativeLayout](http://developer.alexanderklimov.ru/android/layout/relativelayout.php)
- [Единицы измерения](http://developer.alexanderklimov.ru/android/theory/scales.php)
- [ImageView](http://developer.alexanderklimov.ru/android/views/imageview.php)

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 3. Смена активити.

#### Применить 1_1_other_activity.patch (apply + commit + push)

- [Activity](http://developer.alexanderklimov.ru/android/theory/activity-theory.php#what)
- [Button](http://developer.alexanderklimov.ru/android/views/button.php)

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 4. Анимация

#### Применить 1_2_animation.patch (apply + commit + push)

- [Анимация преобразований](http://developer.alexanderklimov.ru/android/animation/tweenanimation.php)

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 5. TranslateAnimation

#### Применить 1_3_translate_animation.patch (apply + commit + push)

- [TranslateAnimation](http://developer.alexanderklimov.ru/android/animation/translateanimation.php)
- [Определение начальных размеров View в Android](http://poetofcode.ru/programming/2017/06/12/kak-opredelit-nachalnyue-razmeryu-view-v-android.html)

---

## ![hw](https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png) Домашнее задание HW_1

```
1. В git сделать ветку домашнего задания "HW_1".
2. Скачать ресурсы для HW_1 и разместить их в соответстующих директориях. 
Сделать commit + push.
```
[Download Resources](https://drive.google.com/file/d/1L9cKSTV6GMOGiAi-OzP2Hj4PlRyo3BAP/view?usp=sharing)
```

3. Создать три кнопки "Dog", "Cat", "Cthulhu", и расположить их в майн активити таким образом:
```
![buttons](https://cdn1.savepice.ru/uploads/2019/2/3/124cf95c5458fc74cab839ce0a814acb-full.jpg)
```
кнопки не должны менять свое относительное положение в зависимости от размера экрана устройства. 
Сделать commit + push.

4. Создать новое Activity "WalkActivity", 
- в MainActivity все три кнопки должны при нажатии менять активити на WalkActivity
- расположите в WalkActivity кнопку "home", для перехода обратно к MainActivity 
- расположите в WalkActivity ImageView в котором должно отображаться изображение того животного с названием 
которого была нажата кнопка в MainActivity. (размер ImageView подберите исходя из здравого смысла:))
- Примените к этому ImageView бесконечную анмацию перемещения по экрану в случайном направлении и на случайное 
растояние. ImageView не должен заходить за края видимого экрана.
Сделать commit + push.

5. Optional
- Сделать так, что бы изображение животного в WalkActivity поворачивось лицом в направлении движения.
Сделать commit + push.

6. Optional 2 (Задание со звёздочкой)
- *Сделать так, что бы при нажатии на изображение животного воспроизводился соответстующий животному звук.
Сделать commit + push.
```

#### Замечания к HW1

- [Работа с ресурсами](https://metanit.com/java/android/2.4.php)
- [Передача данных между Activity](http://developer.alexanderklimov.ru/android/activity.php#passdata)
- для вычисления угла поворота используйте класс Math.
- *Почитайте про класс [ObjectAnimator](https://developer.android.com/reference/android/animation/ObjectAnimator)
- *[Android: MediaPlayer create](https://stackoverflow.com/questions/12154951/android-mediaplayer-create)

---



### Дополнительные материалы:


[Анимации в Android по полочкам](https://habr.com/ru/post/347918/)

[Animation и Transition](http://developer.alexanderklimov.ru/android/animation/)

[Анимации c помощью Transitions API](https://habr.com/ru/post/243363/)