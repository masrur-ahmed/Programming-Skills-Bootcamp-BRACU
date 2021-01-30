import array
arr = array.array('i', [10, 20, 30,40,60])
for i in range (0, 5):
    print (arr[i], end=",")
arr.append(70)
print('\n')
for i in range (0, 6):
    print (arr[i], end=",")
print('\n')
arr.insert(0,10)
for i in range (0, 7):
    print (arr[i], end=",")
arr.remove(10)

print('\n')
for i in range (0, 6):
    print (arr[i], end=",")
print("\n",arr.index(40))

print(arr.count(10))
