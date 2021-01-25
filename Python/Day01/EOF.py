from sys import stdin
counter = 1
# for line in stdin:
#   print("Line",":"+str(counter),line)

# counter = 1
# while True:
#     try:
#         s=input()
#         print("Line",":"+str(counter),s)
#         counter+=1
        
#     except EOFERROR:
#         break
        
        
counter  = 1 
while True:
    try:
        s=next(stdin).strip()
        print("Line",":"+str(counter),s)
        counter+=1

    except StopIteration:
        break
