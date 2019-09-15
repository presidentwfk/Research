ls
echo "# Research" >> README.md
git init
git add README.md
git commit -m "first commit"
git config --global user.email williamvkennedyy@gmail.com
git config --global user.name presidentwfk
git commit -m "first commit"
git remote add origin git@github.com:presidentwfk/Research.git
git push -u origin master
