students = {101: "Alice", 102: "Bob", 103: "Charlie", 104: "David", 105: "Eve"}

students[106] = "Frank"

students[102] = "Ben"

print("Student with ID 103:", students[103])

nested_students = {"Class A": {101: "Alice", 102: "Bob"}, "Class B": {103: "Charlie", 104: "David"}}

print("Students in Class A:", nested_students["Class A"])
print("Name of Student ID 102 in Class A:", nested_students["Class A"][102])

print("Student IDs:", students.keys())

del students[104]

print("Updated Students Dictionary:", students)