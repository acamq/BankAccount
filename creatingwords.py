cases=int(input())
for i in range(cases):
    words= input().split()
    word1=words[0]
    word2=words[1]
    a = word1[0]
    b = word2[0]
    word3 = word1.replace(a,b,1)
    word4 = word2.replace(b,a,1)
    print(word3, " ", word4)

