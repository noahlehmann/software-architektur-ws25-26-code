from pathlib import Path

def main():
    path = Path("access.log")
    try:
        with path.open() as file:
            for line in file:
                print(line, end="")
    except FileNotFoundError:
        print(f"File not found: {path}")

if __name__ == "__main__":
    main()