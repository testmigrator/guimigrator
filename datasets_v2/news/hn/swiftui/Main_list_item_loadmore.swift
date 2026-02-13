import SwiftUI

struct Main_list_item_loadmore: View {
  var body: some View {
    ZStack {
      Text("More").font(.system(size: 24)).foregroundColor(Color(red: 1, green: 0.9294117647058824, blue: 0.8588235294117647, opacity: 1)).frame(maxWidth: .infinity, alignment: .center)
      Image("loadmore").frame(maxWidth: .infinity, alignment: .center)
    }
    .background(Color(red: 0.7647058823529411, green: 0.7098039215686275, blue: 0.6549019607843137, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Main_list_item_loadmore_Previews: PreviewProvider {
  static var previews: some View {
    Main_list_item_loadmore()
  }
}
