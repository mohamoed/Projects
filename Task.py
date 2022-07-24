Q1.

False
              
                                                                               **********

Q2.

<class 'list'>

<class 'list'>
 

                                                                               ***********



Q3.

def GetNumFromFunc():
    x=y=z=10
    return x , y , z

print(GetNumFromFunc())




                                                                          ----------------------


Output(Q3):
(10,10,10)




                                                                                ***********


Q4.

def Sum():
    Sum = 5 + 12
    return(Sum)
print ("5 + 12 = ", Sum())


                                                                             -----------------



Output(Q4) :

5 + 12 = 17





                                                                                 ***********



Q5. Sorry , i tried to solve it





                                                                                 **********


Q6. 


list1 = [10,20,25,30,35]
list2 = [40,45,60,75,90]
list3 = [0,0,0,0,0,0,0]

for i in range(len(list1)):
    if list1[i] % 2 ==1 :
        list3[i]=list1[i]
    else :
        list2[i]%2==0
        list3[i]=list2[i]
        
print (list3)





                                                                          -----------------------



output(Q6) :

[40, 45, 25, 75, 35]




                                                                                 **********

Q7.


def power(base,exp):
    if(exp==1):
        return(base)
    if(exp!=1):
        print(base ," ^ ", exp  )
        return(base*power(base,exp-1))
    
    
base=int(input("Enter base :- "))
exp=int(input("Enter exponential :- "))
print("value :- ",power(base,exp)



                                                                                 **********

Q8.

number= int(input("enter the number :- "))
multiplication_length = int(input("enter multiplication limit :- "))

for i in range(multiplication_length):
    print(number ," * ",i," = ",(number*i))


                                                                                 **********

Q9.



List_memo = [1,2,3,4,5,6,7,8,9,10]
print("the list is = ",List_memo)

Decrease = len(List_memo) - 1

print("in reverse order : ")
for i in range(len(List_memo)):
    print(List_memo[Decrease])
    Decrease-=1



                                                                                 ***********

Q10.



def IsPrimeNum(num):
    if num >1:
        for i in range(2,num):
            if num % i ==0:
             print("none prime :- ")
             return num
        else:
            return num
        
   
Number_range = int(input("enter the number range :- "))

print("prime numbers are :- ")
i =2
for i in range(Number_range):
    print(IsPrimeNum(i));
    



                                                                                  **********


Q11.


for i in range(1,50) :
    
    if(i%3 == 0):
        print(i, " is *FIZZ* " )
    elif(i%5 == 0):
        print(i ," is *BUZZ* ")
    elif((i%5==0)&(i%3==0)):
        print(i, " is *FIZZBUZZ* ")

    
               
                                                                                   **********


Q12.



def Same(user_list):        #
    element1 = user_list[0] #
    for i in user_list :    #  function's job is to check if the list elements ar equal to the first elemnts 
        if i != element1:   #
            return False    #
    return True

LIST = list(input("\nenter your list : "))
if Same(LIST):
    print("\nL1 : Elements are equal ...\n")
else:
    print("L1 : Elements are not equal ...\n")
    
print("your list is :- ",LIST,"\n")






