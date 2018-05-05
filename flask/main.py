from flask import Flask, render_template

app = Flask(__name__)

@app.route('/')
def index():
    return 'ashu chutiya h'

animal = 'dog'

@app.route('/profile')
def cool():
    animal = 'dog1'
    var = 'meow'
    return render_template("index.html", value=animal, var=var)

if  __name__ == "__main__":
    app.run(debug=True)
