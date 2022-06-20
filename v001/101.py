from sys import stdin, stdout


n = int(input())
commands = stdin.read().splitlines()
blocks = [[-1 for y in range(n)] for x in range(n)]
stacks = [i for i in range(n)]  # block at which stack
top = [1 for i in range(n)]  # top index for stacks
for i in range(len(blocks)):
    blocks[i][0] = i

for i in commands:
    command = i.split(' ')
    print(command)
    if command[0] != 'quit':
        a = int(command[1])
        b = int(command[3])
        if command[1] == command[3] or stacks[a] == stacks[b]:
            continue

        if command[0] == 'move':
            ax = blocks[stacks[a]].index(a)
            # stacks[command[1]]#數字1在哪個stack
            for i in range(ax, top[a]):
                blocks[stacks[a]][i]=-1

for r in range(len(blocks)):
    print(f'{r}:', end='')
    for c in range(len(blocks[r])):
        if(blocks[r][c] != -1):
            print(f' {blocks[r][c]}', end='')
    print('')
