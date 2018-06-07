from HTMLParser import HTMLParser
import urllib

countrylist = [32, 48, 44, 20, 16, 56, 68, 0, 80, 76, 24, 36, 84, 72, 28, 64, 8, 4, 60, 12, 52, 40]
class MyHTMLParser(HTMLParser):
    def __init__(self):
	HTMLParser.__init__(self)
	self.istd = 0
	self.recording = 0 
	self.data = []
    def handle_starttag(self, tag, attrs):
	if tag == 'td':
	   self.istd = 1 
	if self.istd == 1:
	    if tag == 'a':
		for (name, value) in attrs:
		    if name == 'href':
			self.recording = 1 
	    elif tag == 'img':
		for(name, value) in attrs:
		    if name == 'alt':
			self.data.append(value)

    def handle_endtag(self, tag):
	if tag == 'td':
	    self.istd -= 1
	if tag == 'a':
	    self.recording -= 1 

    def handle_data(self, data):
	if self.istd: 
	    if self.recording:
		self.data.append(data)

fd = urllib.urlopen('http://www.cwb.gov.tw/V7/forecast/f_index.htm')
parser = MyHTMLParser()
parser.feed(fd.read())
for i in countrylist:
    #for i in range(country,country+4):
    print parser.data[i]+'  '+parser.data[i+1]+'C  '+parser.data[i+2]+'%  '+parser.data[i+3]
