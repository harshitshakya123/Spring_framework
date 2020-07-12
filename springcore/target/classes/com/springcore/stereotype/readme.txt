Stereotype annotation - By the use of this tag in xml we can add Component annotation
 that means using this annotation we can not created a beans simply use this
  annotation on the top of the class.







--------------------------------------------------------


In this package we have discuss about 2 scope 
1- singelton, It means when you print object then any times print the same object you can see using hashcode.
2- prototype, It means all time object are newly created, achieving prototype by using two type 
  a- using xml, In Teacher class, you can see in stereoconfig.xml
  b- annotation, In Student class, top of the student class @Component("ob")