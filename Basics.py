print("Gayu")

print("Comments are used for code documentation.")

int_var = 10
bool_var = True
char_var = 'G'
float_var = 10.5
double_var = 20.56789

print("Integer:", int_var)
print("Boolean:", bool_var)
print("Character:", char_var)
print("Float:", float_var)
print("Double:", double_var)

global_var = "I am a Global Variable"

def my_function():
    global_var = "I am a Local Variable"
    print("Inside Function:", global_var)

my_function()
print("Outside Function:", global_var)