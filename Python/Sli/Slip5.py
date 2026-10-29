from flask import Flask,url_for,redirect,render_template,request


app=Flask(__name__)
@app.route('/')
#index is a function being overloaded
def index():
    return render_template('index.html')



if __name__ =='__main__':
    app.run(debug=True)
