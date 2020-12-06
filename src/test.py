from java.util import Random


print("This is a Python Executable Program...")

random = Random()
for i in range(10):
    if random.nextBoolean():
        print("True")
    else:
        print("False")

print("The End of this Python Executable Program...")
