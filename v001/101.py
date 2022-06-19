from sys import stdin, stdout


n=int(input())
commands=stdin.read().splitlines()
blocks=[[0 for y in range(n)] for x in range(n)]

for i in commands:
    command=i.split(' ')
    print(command)

for r in range(len(blocks)):
    print(f'{r}:',end='')
    for c in range(len(blocks[r])):
        print(f' {blocks[r][c]}',end='')
    print('')
