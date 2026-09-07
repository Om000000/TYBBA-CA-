from PIL import Image
from pathlib import Path

name=input("Enter image name:")
print("Enter following number for conversion format")
print("1.PNG")
print("2. WebP")
print("3.JPG")
formaty=" "

form=int(input())
match form:
    case 1:
                formaty="PNG"
    case 2:
                formaty="WEBP"
    case 3:
                formaty="JPG"
    case _:
        print("Invalid choice!")
        exit()
        

try:
    with Image.open(name) as img:
                            input_path = Path(name)
                            output_name = input_path.with_suffix(f".{formaty.lower()}")
                            if formaty == "JPEG" and img.mode in ("RGBA", "P"):
                                    img = img.convert("RGB")

                            img.save(output_name,format=formaty)
                            print("Converted")

except FileNotFoundError:
        print(f"Error: The file '{name}' could not be found. Please check the path.")