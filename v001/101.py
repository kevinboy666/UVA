from sys import stdin, stdout
n=int(input())
commands=stdin.readlines()
# input=readline()
# n=int(input[0])
# commands=input[1:]
# blocks=[[0 for y in range(n)] for x in range(n)]

for i in commands:
    print(i, end='')
