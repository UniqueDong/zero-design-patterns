# 状态模式又称状态对象模式
* 状态模式（Pattern of Objects for States）是对象的行为模式。
* 状态模式允许一个对象在其内部状态改变的时候改变其行为。这个对象看上去就像是改变了它的类一样。

## 状态模式结构
* 用一句话来表述，状态模式把所研究的对象的行为包装在不同的状态对象里，每一个状态对象都属于一个抽象状态类的一个子类。
状态模式的意图是让一个对象在其内部状态改变的时候，其行为也随之改变。

## 主要角色
* 环境(Context)角色，也成上下文：定义客户端所感兴趣的接口，并且保留一个具体状态类的实例。这个具体状态类的实例给出此环境对象的现有状态。

* 抽象状态(State)角色：定义一个接口，用以封装环境（Context）对象的一个特定的状态所对应的行为。

* 具体状态(ConcreteState)角色：每一个具体状态类都实现了环境（Context）的一个状态所对应的行为。
## 简单总结
从上面可以看出，环境类Context的行为request()是委派给某一个具体状态类的。通过使用多态性原则，

可以动态改变环境类Context的属性State的内容，使其从指向一个具体状态类变换到指向另一个具体状态类，

从而使环境类的行为request()由不同的具体状态类来执行。

## 认识状态模式
### 状态和行为
   所谓对象的状态，通常指的就是对象实例的属性的值；而行为指的就是对象的功能，再具体点说，行为大多可以对应到方法上。

　　状态模式的功能就是分离状态的行为，通过维护状态的变化，来调用不同状态对应的不同功能。也就是说，状态和行为是相关联的，它们的关系可以描述为：状态决定行为。

　　由于状态是在运行期被改变的，因此行为也会在运行期根据状态的改变而改变。

### 行为的平行性
注意平行线而不是平等性。所谓平行性指的是各个状态的行为所处的层次是一样的，相互独立的、没有关联的，是根据不同的状态来决定到底走平行线的哪一条。

行为是不同的，当然对应的实现也是不同的，相互之间是不可替换的。

大家可能会发现状态模式的结构和策略模式的结构完全一样，但是，它们的目的、实现、本质却是完全不一样的。还有行为之间的特性也是状态模式和策略

模式一个很重要的区别，状态模式的行为是平行性的，不可相互替换的；而策略模式的行为是平等性的，是可以相互替换的。

策略是同一个行为，不同实现。状态是不同行为不同实现。

### 环境和状态处理对象
在状态模式中，环境(Context)是持有状态的对象，但是环境(Context)自身并不处理跟状态相关的行为，而是把处理状态的功能委托给了状态对应的状态处理类来处理。

　　在具体的状态处理类中经常需要获取环境(Context)自身的数据，甚至在必要的时候会回调环境(Context)的方法，因此，通常将环境(Context)自身

当作一个参数传递给具体的状态处理类。

　　客户端一般只和环境(Context)交互。客户端可以用状态对象来配置一个环境(Context)，一旦配置完毕，就不再需要和状态对象打交道了。

客户端通常不负责运行期间状态的维护，也不负责决定后续到底使用哪一个具体的状态处理对象。

### 策略模式与状态模式对比
* 状态模式：不同的状态标表示不同的行为，对应不同的处理方式。
* 策略模式： 同一个行为，不同处理。因此在同一个行为发生的时候，可以根据条件挑选任意一个实现来进行相应的处理

